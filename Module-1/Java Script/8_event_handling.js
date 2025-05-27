// Event Handling
document.querySelector("#registerBtn").onclick = function () {
    alert("Registration successful!");
};

document.querySelector("#filter").onchange = function () {
    console.log(`Filter selected: ${this.value}`);
};

document.querySelector("#searchBox").addEventListener("keydown", function (event) {
    console.log(`User typing: ${event.key}`);
});