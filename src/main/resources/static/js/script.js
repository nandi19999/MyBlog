function goNext(pageUrl) {
    window.location.href = pageUrl;
}

async function  postBlog() {

    console.log("Inside buton");
    const form = document.getElementById("form");
    const data = new FormData(form);
    const Jsonobj = {};
    for (let [key, value] of data.entries()) {
        Jsonobj[key] = value;
    }
    const JsonString = JSON.stringify(Jsonobj);
    console.log("Json object created");
    //Preventing default behavior of browser.
    event.preventDefault();
    fetch("http://localhost:8080/add", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JsonString
    })
        .then(response => response.text()) // or .json() if expecting JSON
        .then(data => {
            console.log("success");
        })
        .catch(error => {
            console.error("Error:", error);
        });
}