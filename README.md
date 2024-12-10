## kobweb-ksp-reproducer

### Most minimal reproducer

The build is stopped on `compileKotlinJs` task

However, with kotlin `1.9.21` everything is fine - try change [libs.versions.toml](./gradle/libs.versions.toml)

```bash
git clone https://github.com/makeevrserg/kobweb-ksp-reproducer.git
cd kobweb-ksp-reproducer
./gradlew compileKotlinJs --info --debug --stacktrace
```
