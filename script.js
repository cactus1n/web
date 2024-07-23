fetch('https://cactus1n.github.io/web/data.json')
  .then(response => response.json())
  .then(data => {
    const phrases = data.phrases;
    const randomPhrase = phrases[Math.floor(Math.random() * phrases.length)];
    document.body.textContent = randomPhrase;
  });
