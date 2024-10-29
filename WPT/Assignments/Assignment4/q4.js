function callback1(response){
    console.log(response);
}

const fetchData = (url, callback,response) => {
    try{
        if(!url) throw new Error('missing url');
        console.log(`Fetching data from ${url}...`);
        setTimeout(() => callback(response), 2000); // 2-second delay
    }
  
  catch(error){
    console.log(error);
  }
}

fetchData('https://example.url/', (response) => callback1(response),'This is my response');
fetchData('', (response) => callback1(response),'This is my response');