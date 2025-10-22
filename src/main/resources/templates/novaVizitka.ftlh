[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>

<form action="/" method="post" class="styled-form">
    <h1 style="text-align: center" style="color: floralwhite">Nová vizitka</h1>

    <div class="mb-3">
        <label for="jmeno" class="form-label">Celé jméno</label>
        <input type="text" class="form-control" id="jmeno" name="jmeno" placeholder="Ing. Jan Novák">
    </div>

    <div class="mb-3">
        <label for="firma" class="form-label">Firma</label>
        <input type="text" class="form-control" id="firma" name="firma" placeholder="Example a.s.">
    </div>

    <div class="mb-3">
        <label for="ulice" class="form-label">Ulice a číslo popisné</label>
        <input type="text" class="form-control" id="ulice" name="ulice" placeholder="Jindřišská 1356/1" >
    </div>

    <div class="mb-3">
        <label for="obecPsc" class="form-label">PSČ a název obce</label>
        <input type="text" class="form-control" id="obecPsc" name="obecPsc" placeholder="110 00 Praha 1" >
    </div>

    <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <input type="email" class="form-control" id="email" name="email" placeholder="example@example.com">
    </div>

    <div class="mb-3">
        <label for="telefon" class="form-label">Telefon</label>
        <input type="tel" class="form-control" id="telefon" name="telefon" placeholder="+420 123 456 789">
    </div>

    <div class="mb-3">
        <label for="web" class="form-label">Web</label>
        <input type="web" class="form-control" id="web" name="web" placeholder="www.example.com">
    </div>

    <button type="submit" class="btn btn-primary">Uložit vizitku</button>

    <button class="delete-button" >
        <a href="/">◂ Zpět na seznam</a>
    </button>
</form>

</body>
</html>

