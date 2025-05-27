// Form Handling
document.querySelector("form").addEventListener("submit", function (event) {
    event.preventDefault();

    const name = this.elements["name"].value;
    const email = this.elements["email"].value;

    if (!name || !email) {
        alert("Please fill all fields!");
    } else {
        console.log(`Registered: ${name}, ${email}`);
    }
});