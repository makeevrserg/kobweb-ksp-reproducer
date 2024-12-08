## kobweb-ksp-reproducer

The build is stopped on `compileKotlinJs` task.

```bash
./gradlew :components:wiki:compileKotlinJs --info --debug --stacktrace
```

The output is inifinite with:

```text
2024-12-08T20:43:07.416+0300 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 7: released lock on worker lease
2024-12-08T20:43:07.416+0300 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 8: acquired lock on worker lease
2024-12-08T20:43:07.416+0300 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 8: released lock on worker lease
2024-12-08T20:43:07.416+0300 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 9: acquired lock on worker lease
2024-12-08T20:43:07.416+0300 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 9: released lock on worker lease
2024-12-08T20:43:07.416+0300 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 10: acquired lock on worker lease
2024-12-08T20:43:07.416+0300 [DEBUG] [org.gradle.internal.resources.AbstractTrackedResourceLock] Execution worker Thread 10: released lock on worker lease
2024-12-08T20:43:13.869+0300 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2024-12-08T20:43:13.870+0300 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2024-12-08T20:43:13.870+0300 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
2024-12-08T20:43:13.870+0300 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Waiting to acquire shared lock on daemon addresses registry.
2024-12-08T20:43:13.870+0300 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Lock acquired on daemon addresses registry.
2024-12-08T20:43:13.871+0300 [DEBUG] [org.gradle.cache.internal.DefaultFileLockManager] Releasing lock on daemon addresses registry.
```

To run `web-app` execute code below. This will download kobweb-cli and run `web-app`

```bash
bash run.sh -a web-app
```