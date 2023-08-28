@import gg.jte.Content

@param Content course = null
@param Content courses = null

<!doctype html>
<html lang="en">
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
              crossorigin="anonymous">
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width initial-scale=1" />
        <title>Layout example</title>
    </head>
    <body>
        <div>
            <h2>Заголовок</h2>
            <a href="https://ru.hexlet.io/" title="Hexlet">Hexlet</a>
        </div>
        <main>
            @if(course == null && courses == null)
                <p>Шаблон основной страницы</p>
            @else
                ${course}
                ${courses}
            @endif
        </main>
        <div class="footer">
            <a href="https://github.com/CyberXAndrew">My GitHub</a>
        </div>
    </body>
</html>