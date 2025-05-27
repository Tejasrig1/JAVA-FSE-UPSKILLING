// AJAX & Fetch
function registerUser() {
    fetch("https://mock-api.com/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ name: "John Doe", email: "john@example.com" })
    })
    .then(response => response.json())
    .then(data => console.log("Registration Success:", data))
    .catch(error => console.log("Error:", error));

    setTimeout(() => console.log("Processing request..."), 2000);
}