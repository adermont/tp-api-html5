/**
 * typedef {Object} Author
 * @property {Picture} Author.picture
 * @property {string} Author.name
 */
/**
 * typedef {Object} Picture
 * @property {string} Picture.medium
 */

function createNode(element) {
    return document.createElement(element);
}

function append(parent, el) {
    return parent.appendChild(el);
}

const url = 'https://randomuser.me/api/?results=10';

function getHtmlUlAuthors() {
    return document.getElementById('authors');
}

fetch(url)
    .then((resp) => resp.json())
    .then(data => {
        let authors = data.results;
        const ul = getHtmlUlAuthors();
        return authors.map(/** @param {Author} author*/ function (author) {
            let li = createNode('li');
            let img = createNode('img');
            let span = createNode('span');
            img.src = author.picture.medium;
            span.innerHTML = `${author.name.first} ${author.name.last}`;
            append(li, img);
            append(li, span);
            append(ul, li);
        })
    })
    .catch(function (error) {
        console.log(error);
    });