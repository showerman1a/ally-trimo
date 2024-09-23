document.addEventListener('DOMContentLoaded', () => {
    const commentButtons = document.querySelectorAll('.comment-btn');
    
    commentButtons.forEach(button => {
        button.addEventListener('click', () => {
            const commentSection = button.previousElementSibling;
            const newComment = commentSection.previousElementSibling.value;
            if (newComment.trim()) {
                const commentList = commentSection.querySelector('.comments');
                const commentElement = document.createElement('p');
                commentElement.innerHTML = `<strong>You:</strong> ${newComment}`;
                commentList.appendChild(commentElement);
                commentSection.previousElementSibling.value = '';
            }
        });
    });
});
