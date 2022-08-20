id = document.getElementById('out-id').textContent;
delete_btn = document.getElementById('delete-btn');

delete_btn.addEventListener ('click', () => {

    fetch(`/contact/${id}`, {
        method: 'DELETE'}
    )
    .then(alert('Borrado con éxito'));
    window.location.href = `/contacts`;
});