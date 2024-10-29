function callback1(response) {
    return response;
}

const fetchData = (url, callback, response) => {
    try {
        if (!url) {
            throw new Error("URL is missing!");
        }
        console.log(`Fetching data from ${url}...`);
        setTimeout(() => callback(response), 2000);
    } catch (error) {
        console.log(error.message);
    }
};

const processData = (data) => {
    console.log(`This is processed data ${data.toUpperCase()}`);
};
fetchData('', (response) => {
    const response1 = callback1(response);
    processData(response1);
}, 'This is my response1');
fetchData('https://example.url2/', (response) => {
    const response2 = callback1(response);
    processData(response2);
}, 'This is my response2');