// DOM Manipulation
document.addEventListener("DOMContentLoaded", () => {
    const eventContainer = document.querySelector("#events");

    const newEvent = document.createElement("div");
    newEvent.innerHTML = "<h3>New Event</h3><p>Details here</p>";
    eventContainer.appendChild(newEvent);
});