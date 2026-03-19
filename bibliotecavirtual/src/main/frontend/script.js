const API = "http://localhost:8081/sistemaslivros";

function carregarLivros() {
fetch(API)
.then(resposta => resposta.json())
.then(livros => {

    const lista = document.getElementById("listarLivros")
    lista.innerHTML = "";


livros.forEach(livro => {

const li = document.createElement("li")

li.innerHTML = `
<img id="capa-${livro.id}" width="80">

<div>
<strong>${livro.titulo}</strong>
<span>${livro.autor} (${livro.ano})</span>

</div>


<button onclick="lerLivro(${livro.id})">Lido</button>
<button onclick="deletarLivros(${livro.id})">Deletar</button>
`;

lista.appendChild(li);
carregarCapa(livro.titulo, livro.autor, livro.id);

    })


})

}

// função
// requisiçao apra api (ftech
// metodos
// converter para json
// body:JSON.stringif para objeto em js(obrigatorio)
// .then para atualizar os dados

function cadastrarLivro() {

const titulo = document.getElementById("titulo").value
const ano = document.getElementById("ano").value;
const autor = document.getElementById("autor").value;

fetch(API, {
    method: "POST",
    headers: {"Content-Type": "application/json"
    },
    body: JSON.stringify({
    titulo:titulo,
    ano:ano,
    autor:autor,
    lido:false
    })
   })

.then(resposta => resposta.json())
.then(resposta => {
carregarLivros()
})

}

//lido ou n

function deletarLivros(id) {
fetch(`${API}/${id}`, {
method: "DELETE"
})
.then(carregarLivros);
}

function lerLivro(id) {
fetch(`${API}/${id}/lido`,{
method: "PUT"
})
.then(carregarLivros);
}

function carregarCapa(titulo, autor, id) {
fetch(`https://openlibrary.org/search.json?title=${titulo}&author=${autor}`)


.then(resposta => resposta.json())
.then(dados => {
if (!dados.docs || dados.docs.length === 0) return;

// Pega o primeiro livro com capa
const livro = dados.docs.find(l => l.cover_i);
if (!livro) return;

const urlCapa = `https://covers.openlibrary.org/b/id/${livro.cover_i}-M.jpg`;
document.getElementById(`capa-${id}`).src = urlCapa;
});
}
carregarLivros()

