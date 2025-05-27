// Syntax, Data Types, and Operators
const eventName = "Community Meetup";
const eventDate = "2025-06-10";
let availableSeats = 50;

console.log(`Event: ${eventName}, Date: ${eventDate}, Seats: ${availableSeats}`);

function register() {
    if (availableSeats > 0) {
        availableSeats--;
        console.log(`Seats left: ${availableSeats}`);
    } else {
        console.log("Event is fully booked!");
    }
}