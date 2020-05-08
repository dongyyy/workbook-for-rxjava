# workbook-for-rxjava
Learn about rxjava day by day

Environment
--------
- MacOS
- Intellij 2019.3
- Java 12
- For gradle, I created this project with the following setting.

    1. New project > Gradle Tap (at Left side) > check Java
    
Build
--------
```gradle
dependencies {
    implementation 'io.reactivex.rxjava2:rxjava:2.2.19'
}
```

Convention
--------
- Name rule for package:
    + `Chapter N` - chapter01, chapter02

- Name fule for file:
    + The prefix is Code with `snake_case`
    + Prefix `n` means number, `p` menas page, `s` means sequence.
    + `Code1-2`: Code_n02p33s01_${ClassName}
    + `Code on the page`: Code_n02p33s02_${ClassName} *(After 02, Page 33, Sequence 2nd)*

Reference
--------

- Sample Code: <https://github.com/yudong80/reactivejava>
