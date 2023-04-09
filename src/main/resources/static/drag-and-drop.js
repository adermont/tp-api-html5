const dropzone = document.querySelector('#dropzone');

const items = document.querySelectorAll('.item');
items.forEach((item) => {
    item.addEventListener('dragstart', (event) => {
        event.dataTransfer.setData('text/plain', event.target.id);
        event.currentTarget.style.backgroundColor = '#f1f1f1';
    });
    item.addEventListener('dragend', (event) => {
        event.currentTarget.style.backgroundColor = '#f9f9f9';
    });
});

dropzone.addEventListener('dragover', (event) => {
    event.preventDefault();
    event.dataTransfer.dropEffect = 'move';
});

dropzone.addEventListener('drop', (event) => {
    event.preventDefault();
    const data = event.dataTransfer.getData('text/plain');
    const item = document.getElementById(data);
    item.parentNode.removeChild(item);
    dropzone.appendChild(item);
});