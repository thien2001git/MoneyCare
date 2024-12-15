
const thiepButton = document.getElementById("thiepButton")
let count = 0
thiepButton.addEventListener("click", (ev) => {
    thiepButton.innerText = `ban click ${++count}`
})