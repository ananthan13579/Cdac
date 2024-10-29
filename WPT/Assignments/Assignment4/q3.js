function callback1(response){
    console.log(response);
}

const fetchData = (url, callback,response) => {
  console.log(`Fetching data from ${url}...`);
  setTimeout(() => callback(response), 2000); // 2-second delay
}

fetchData('https://example.url/', (response) => callback1(response),'This is my response');