// Conditionals, Loops, Error Handling
const events = [
    { name: "Tech Talk", date: "2025-06-15", seats: 10 },
    { name: "Music Fest", date: "2025-05-01", seats: 0 },
];

events.forEach(event => {
    if (new Date(event.date) > new Date() && event.seats > 0) {
        console.log(`Upcoming Event: ${event.name} (${event.seats} seats available)`);
    }
});

function registerForEvent(event) {
    try {
        if (event.seats > 0) {
            event.seats--;
            console.log(`${event.name} registration successful! Seats left: ${event.seats}`);
        } else {
            throw new Error("No seats available!");
        }
    } catch (error) {
        console.log("Error:", error.message);
    }
}
