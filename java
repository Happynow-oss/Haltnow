const linkInput = document.getElementById('linkInput');
const generateButton = document.getElementById('generateButton');

generateButton.addEventListener('click', () => {
  const link = linkInput.value;
  // Send request to server-side script
  fetch('/generate-likes-views', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({ link: link })
  })
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error(error));
});