// Get references to the elements
const uploadPoetryButton = document.getElementById('uploadPoetryButton');
const poetryContent = document.getElementById('poetryContent');
const poetryDisplay = document.getElementById('poetryDisplay');

// Function to handle uploading the poetry
uploadPoetryButton.addEventListener('click', function() {
    const poetryText = poetryContent.value.trim();

    if (poetryText) {
        // Display the uploaded poetry in the designated section
        poetryDisplay.innerText = poetryText;

        // Optionally, you can store the poetry in local storage so that it remains even after refresh
        localStorage.setItem('uploadedPoetry', poetryText);

        // Clear the textarea after upload
        poetryContent.value = '';
    } else {
        alert('Please write some poetry before uploading!');
    }
});

// On page load, check if any poetry was previously uploaded
window.addEventListener('load', function() {
    const savedPoetry = localStorage.getItem('uploadedPoetry');
    if (savedPoetry) {
        poetryDisplay.innerText = savedPoetry;
    }
});
