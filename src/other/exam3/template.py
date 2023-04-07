import os

to_html = ""

for file in [filename for filename in os.listdir() if ".java" in filename]:
    # print(file)
    code = open(file).read()

    os.environ["output"] = ""
    os.system(f"java {file}")

    output = os.environ["output"]

    to_html += "<output>{str(output)}</output>"
    print(to_html)


open("index.html", "w").write(
f"""
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
{to_html}
</body>
</html>
"""

)


