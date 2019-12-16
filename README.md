- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `#f03c15`
- ![#c5f015](https://placehold.it/15/c5f015/000000?text=+) `#c5f015`
- ![#1589F0](https://placehold.it/15/1589F0/000000?text=+) `#1589F0`

# KotlinMultiLanguage
Android kotlin library for change ui language in android application at runtime.

![Alt Text](https://media.giphy.com/media/VEcDJtSPLjQ6X3NRbs/giphy.gif)


# Installation

```
implementation 'com.ninenox.kotlinlocalemanager:kotlin-locale-manager:1.0.0'
```

# Getting Started

Create class and extend ApplicationLocale.

```
class App : ApplicationLocale() {

}
```

In AndroidManifest
```
<application
        android:name=".App"
        ...
        />
```

In every activity extend AppCompatActivityBase.

```
class MainActivity : AppCompatActivityBase() {

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        change_language_th_button.setOnClickListener {
            setNewLocale("TH")
        }
        change_language_en_button.setOnClickListener {
            setNewLocale("EN")
        }

    }
    
}
```

![Alt Text](https://media.giphy.com/media/vFKqnCdLPNOKc/giphy.gif)

