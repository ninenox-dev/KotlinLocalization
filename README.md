<img src="https://camo.githubusercontent.com/796303e3aab882a1d006714740d84ff88ea2c27f/68747470733a2f2f696d672e736869656c64732e696f2f6d6176656e2d63656e7472616c2f762f696f2e6d6f636b6b2f6d6f636b6b2e7376673f6c6162656c3d72656c65617365" alt="Relase Version" data-canonical-src="https://img.shields.io/maven-central/v/io.mockk/mockk.svg?label=release" style="max-width:100%;"> <img src="https://camo.githubusercontent.com/100bb71a7d486cd56523fa6a1413a319afa53e51/68747470733a2f2f6170692e62696e747261792e636f6d2f7061636b616765732f6b6f746c696e2f6b6f746c696e782f6b6f746c696e782e636f726f7574696e65732f696d616765732f646f776e6c6f61642e7376673f76657273696f6e3d312e332e33" alt="Download" data-canonical-src="https://api.bintray.com/packages/kotlin/kotlinx/kotlinx.coroutines/images/download.svg?version=1.3.3" style="max-width:100%;"> <img src="https://camo.githubusercontent.com/eb54d63dadf4ca40382d1b11f736ec31a24e0aff/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f616e64726f69642d737570706f72742d677265656e2e737667" alt="Android" data-canonical-src="https://img.shields.io/badge/android-support-green.svg" style="max-width:100%;">

# KotlinMultiLanguage
Android kotlin library for change ui language in android application at runtime.

![Alt Text](https://media.giphy.com/media/VEcDJtSPLjQ6X3NRbs/giphy.gif)


# Installation
On your module app `build.gradle` add
```
dependencies {
     implementation 'com.ninenox.kotlinlocalemanager:kotlin-locale-manager:1.0.0'
}
```

# Getting Started

1. Create class and extend `ApplicationLocale`.

```
class App : ApplicationLocale() {

}
```

2. In `AndroidManifest.xml`
```
<application
        android:name=".App"
        ...
        />
```

3. In folder `res` add new locale.

```
values-th
   - strings.xml
values-en
   - strings.xml
```

4. In any `Activity` extend `AppCompatActivityBase` on it.

```
class MainActivity : AppCompatActivityBase() {

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        ...
        
    }
    
}
```
5. Call funtion `setNewLocale("...")` for set current language and refresh ui.
```

setNewLocale("EN") // Sample "EN","TH","DE"...
        
```

6. Get current code language string.
```
LocaleManager(this).language.toString() // "EN"
```
        


![Alt Text](https://media.giphy.com/media/vFKqnCdLPNOKc/giphy.gif)

