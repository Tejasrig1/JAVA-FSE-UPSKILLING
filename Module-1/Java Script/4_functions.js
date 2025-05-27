// Functions, Scope, Closures, Higher-Order Functions
function addEvent(name, date, category) {
    return { name, date, category, attendees: 0 };
}

function registerUser(event) {
    event.attendees++;
}

function filterEvents(events, callback) {
    return events.filter(callback);
}

const eventsList = [
    addEvent("Coding Bootcamp", "2025-07-10", "Education"),
    addEvent("Rock Concert", "2025-08-12", "Music"),
];

console.log(filterEvents(eventsList, event => event.category === "Music"));