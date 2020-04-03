$(document)
    .ready(() =>
        $.ajax({url: "http://localhost:8081/springfundamentals/user"})
            .then(data => {
                $('.first-name').append(data.firstName);
                $('.last-name').append(data.lastName);
                $('.age').append(data.age);
            }));
