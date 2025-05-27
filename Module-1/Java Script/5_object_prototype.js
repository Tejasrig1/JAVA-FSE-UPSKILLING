// Objects and Prototypes
function Event(name, date, seats) {
    this.name = name;
    this.date = date;
    this.seats = seats;
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};

const myEvent = new Event("Charity Gala", "2025-09-01", 50);
console.log(Object.entries(myEvent));
console.log(`Is event available? ${myEvent.checkAvailability()}`);