# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com), and this project follows to [Ragnarök Versioning Convention](https://github.com/Red-Studio-Ragnarok/Commons/blob/main/Ragnar%C3%B6k%20Versioning%20Convention.md).

## [UNRELEASED] Red Core Version 0.6 Changelog

### Deprecation Warning

The method `RedLogger#printFramedError` has been renamed to `RedLogger#logFramedError`, all usages should be updated before 0.8.

### Added

- `Case` a utility enum for handling checking, applying and enforcing naming conventions, currently supported casing:
  - `camelCase`
  - `PascalCase`
  - `kebab-case`
  - `lower_snake_case`
  - `UPPER_SNAKE_CASE`
- Added `RedLogger#logFramed` which allows logging lists in a readable manner (e.g., versioning information)
- Added `DecimalUtils` a utility class which currently allows for truncating decimal numbers for human reading
- Added empty private constructors to hide implicit public ones

### Changed

- Improved documentation for `RedLogger#logFramedError`
- Renamed `RedLogger#printFramedError` to `RedLogger#logFramedError`

### Internal

- Updated to [foojay-resolver](https://github.com/gradle/foojay-toolchains) 0.8.0
- Updated to [gradle-buildconfig-plugin](https://github.com/gmazzo/gradle-buildconfig-plugin) 5.4.0
- Updated to [Gradle](https://gradle.org) 8.8
- Changed the root project name
- Set a minimum Gradle Daemon JVM version requirement
- Switched to the new standard `gradle.properties`
- Updated to [io.freefair.lombok](https://plugins.gradle.org/plugin/io.freefair.lombok) 8.7.1
- Updated Qodana
- Use Jabel
- Cleanup buildscript
- General cleanup

### Red Core MC

#### Added

- `AABBUtil` a utility class for handling axis aligned bounding boxes
- `AABBUtil#orientAABB` a utility method for orienting a north facing AABB towards any `EnumFacing` allowing you to make only one AABB that works for every direction
- Added empty private constructors to hide implicit public ones

#### Removed

- Removed support for 1.7.10 (Compatibility layer caused issue with the ownership system, wrongfully attributing issues to Red Core)

#### Optimization

- `OptiNotFine` now uses `MethodHandle`

#### Internal

- Minor cleanup
- Updated to [RetroFuturaGradle](https://github.com/GTNewHorizons/RetroFuturaGradle) 1.4.1

## Red Core Version 0.5.1 Changelog - 2023-11-20

### Red Core MC

#### Changed

- Improved compatibility with older versions

#### Fixed

- Fixed version check
- Fixed mod not showing up in the mod menu in older versions

## Red Core Version 0.5 Changelog - 2023-11-17

### Highlight

Welcome to Red Core 0.5 an originally breaking release, but now it has a compatibility layer, all mods using it should update before 0.8 when the compatibility layer will be removed.

*Note: The compatibility layer is only for the MC (Minecraft) part of Red Core as normally it should only have been used there prior to 0.5*

#### The separation

Red Core and its Minecraft parts have been separated into two, this allows for greater freedom in how we develop Red Core, but also allows for Red Core to be used in any Java project.
Thanks to this separation, Red Core MC is now available for 1.7.10 through 1.12.2 meaning every version in between is compatible.

#### New GroupId

The old groupId was bad, and I did not own it, now both of these things are fixed by the brand new `dev.redstudio` which is more readable and sounds better, also I actually own it.

#### Re-Branding!
![Red Core Banner](https://github.com/Red-Studio-Ragnarok/Red-Core/assets/82710983/2cab5fb2-96dc-4738-83d2-907d5e835e2a)
Say welcome to the new Red Core branding! The Readme is also getting a makeover.

### Added

- Added an `Experimental` annotation
- Added a new experimental vector suite, this is supposed to replace the existing vector suite in 0.6 the existing vector suite is marked for removal in 0.8
- Added a compatibility layer for old groupId which is marked for removal in 0.8

### Changed

- `MathUtil` is now under `utils.math`
- Separated `MathUtil` clamping methods into their own class `ClampUtil`
- Changed GroupId from `io.redstudioragnarok` to `dev.redstudio`
- Made `RedLogger#RANDOM` private

### Removed

- Removed `Stopwatch` it wasn't that good or useful but was fun to make

### Fixed

- Fixed inconsistent argument naming in `MathUtil#lerp`

### Internal

- Switched to [gradle-buildconfig-plugin](https://github.com/gmazzo/gradle-buildconfig-plugin) entirely for project constants
- Switched to Gradle Kotlin DSL
- Switched to Adoptium
- General cleanup

### Red Core MC

#### Added

- Added support for mc versions 1.7.10 through 1.12.2

#### Changed

- Switched to [CurseUpdate](https://forge.curseupdate.com/) for update checking
- Moved `startClientTicker` from `RedCore` to `RedClientTicker
- Moved `forceOptiFineFastRenderOff` from `RedCore` to `OptiNotFine`
- Deprecated the vector suite as it is to be replaced by the new vector suite in 0.6

#### Removed

- Removed `pack.mcmeta`

#### Internal

- General cleanup

---

## Red Core Version 0.4 Changelog - 2023-09-07

### Highlight

Welcome to Red Core 0.4 a non-breaking release that includes a lot of Quality of Life enhancements and general polishing of certain parts of Red Core.

Red Core 0.5 will be a breaking release since we will switch from `io.redstudioragnarok` to `dev.redstudio` stay tuned as dev builds will only be released for devs on GitHub as to not cause issue will mods prepare their updates.

#### Networking with Vectors just got a lot easier and cleaner too!

You now have `read` and `write` methods for all Vectors from Red Core, it simply take in `ByteBuf` and takes care of the rest.

##### Before

<img src="https://github.com/Red-Studio-Ragnarok/Red-Core/assets/82710983/441c5edd-8ecc-4c8f-9f5f-5db6b6749f4c" alt="Before" height="480">

##### After

<img src="https://github.com/Red-Studio-Ragnarok/Red-Core/assets/82710983/7b01142f-77da-445b-8b49-a156755cbaea" alt="After" height="420">

### Red Logger just got cleaner!

`RedLogger#printFramedError` will not add empty lines anymore if `whatNow` and/or `additionalInformation` is empty.

##### Before

<img src="https://github.com/Red-Studio-Ragnarok/Red-Core/assets/82710983/69d6f955-a1f3-4da9-a74d-c927023f2b20" alt="Before" height="256">

##### After

<img src="https://github.com/Red-Studio-Ragnarok/Red-Core/assets/82710983/dcf72281-e730-4d64-be45-5960af6b49e2" alt="After" height="256">

### Added

- **NetworkUtil:** Designed to streamline network coding practices, this utility makes writing cleaner, safer, and more efficient networking code effortless.
- Added `read` and `write` methods to all vectors that allows for easy networking
- Added `int`, `short` and `byte` versions of `clampTest`, `clampMinFirst` and `clampMaxFirst` in `MathUtil`
- Added `int` versions of the vectors
- Added a `Vec2f` constructor for the 2-dimensional vectors
- Added a `zero` method for the 2-dimensional vector
- Added missing `pack.mcmeta`

### Changed

- Red Core is now a core-mod making it load as early as possible, so Red Core can now be used in Mixins for example
- `RedLogger#printFramedError` will not add empty lines if `whatNow` and/or `additionalInformation` is empty
- Improved error logging of the Stopwatch
- Red Core jar name now has a `!` at the start so that it gets loaded earlier than mods using it
- Cleaned up the vectors they might be slightly more performant as a result
- Updated `mcmod.info`

### Fixed

- Fixed Red Core using the wrong GitHub issue link when logging errors
- Fixed Red Core using its id instead of its name for logging

---

## Red Core Version 0.3.1 Changelog - 2023-7-16 [YANKED]

### Fixed

- Fixed Forge not being able to subscribe the RedClientTicker causing a crash

---

## Red Core Version 0.3 Changelog - 2023-7-16

### Added

- **RedClientTicker:** A useful ticker that allows you to have ticks every 2, 5 or 10 normal ticks, for things that shouldn't run 20 times a second.
- **OptiNotFine:** A must-have when working with OptiFine compatibility, it allows you to know if OptiFine is installed, whether shaders are loaded, and to force fast render off.

### Changed

- RedLogger now uses a String instead of a URI for the `newIssueLink` parameter, the old constructor has been deprecated and is due for removal for 0.4
- RedLogger recomfort messages might be more random

### Optimized

- Optimized `RedLogger#printFramedError` it should now use slightly less memory and thus have less GC pressure

---

## Red Core Version 0.2 Changelog - 2023-6-13

### Added

- **MathUtil:** A purpose-built class providing an array of mathematical methods, engineered with a steadfast focus on rapid processing and calculations.
- **Vectors:** A comprehensive and efficient suite of vectors, designed with performance and simplicity in mind.
- **RedLogger:** An advanced error logger engineered to make error logging and understanding significantly more user-friendly.
- **Included [Jafama](https://github.com/jeffhain/jafama)**: A high-performance math library now incorporated within the Red Core, for better compatibility between mods.
- **Stopwatch Enhancements:** The Stopwatch feature now boasts the ability to output results directly to a file, in addition to averaging all these results for comprehensive analysis.

### Changed

- Renamed the `Chronometer` component to the more intuitive `Stopwatch` for improved user understanding.
- The Stopwatch feature has been refined to display outputs in milliseconds, accurate up to two decimal places.

