// Modern JavaScript Features (ES6+)
const eventInfo = { name: "Music Fest", date: "2025-07-20", location: "City Square" };
const { name, date, location } = eventInfo;

console.log(`Event: ${name}, Date: ${date}, Location: ${location}`);

const clonedEvents = [...communityEvents];
console.log(clonedEvents);