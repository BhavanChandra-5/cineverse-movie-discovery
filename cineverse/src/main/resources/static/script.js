async function searchMovies() {

    const letter = document.getElementById("letterInput").value;

    if(letter===""){
        alert("Please enter a letter");
        return;
    }

	const response = await fetch(
	    "http://localhost:8080/movies/search?query=" + letter
	);

    const movies = await response.json();
	if (movies.length === 0) {

	    document.getElementById("movieContainer").innerHTML =
	        `<h2>No movies found matching "${letter}"</h2>`;

	    return;

	}

    let output = "";

    movies.forEach(movie => {

        output += `
            <div class="movie-card">

                <h2>${movie.movieName}</h2>

                <p><strong>Genre:</strong> ${movie.genre}</p>

                <p><strong>Director:</strong> ${movie.director}</p>

                <p><strong>Release Year:</strong> ${movie.releaseYear}</p>

                <p><strong>Rating:</strong> ⭐ ${movie.rating}</p>

                <p><strong>Language:</strong> ${movie.language}</p>

                <p>${movie.description}</p>

            </div>
        `;

    });

    document.getElementById("movieContainer").innerHTML = output;

}
const input = document.getElementById("letterInput");

input.addEventListener("input", async function () {

    const query = input.value.trim();

    if(query.length === 0){
        document.getElementById("suggestions").innerHTML = "";
        return;
    }

    const response = await fetch(
        "http://localhost:8080/movies/suggestions?query=" + query
    );

    const movies = await response.json();

    let output = "";

    movies.forEach(movie => {

        output += `
            <div class="suggestion-item"
                 onclick="selectMovie('${movie.movieName}')">

                ${movie.movieName}

            </div>
        `;

    });

    document.getElementById("suggestions").innerHTML = output;

});
function selectMovie(movieName) {

    document.getElementById("letterInput").value = movieName;

    document.getElementById("suggestions").innerHTML = "";

}