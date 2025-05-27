// Arrays and Methods
const communityEvents = [
    { name: "Coding Bootcamp", type: "Education" },
    { name: "Rock Concert", type: "Music" },
];

communityEvents.push({ name: "Art Exhibition", type: "Art" });

const musicEvents = communityEvents.filter(event => event.type === "Music");

const formattedEvents = communityEvents.map(event => `Event: ${event.name}`);

console.log(musicEvents);
console.log(formattedEvents);