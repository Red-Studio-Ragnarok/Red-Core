# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/), and this project follows to [Ragnarök Versioning Convention](https://shor.cz/ragnarok_versioning_convention).

## [Unreleased] Red Core Version 0.4 Changelog

### Highlight

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

#### After

<img src="https://github.com/Red-Studio-Ragnarok/Red-Core/assets/82710983/dcf72281-e730-4d64-be45-5960af6b49e2" alt="After" height="256">

### Added

- **NetworkUtil:** Designed to streamline network coding practices, this utility makes writing cleaner, safer, and more efficient networking code effortless.
- Added `read` and `write` methods to all vectors that allows for easy networking

### Changed

- Red Core is now a core-mod making it load as early as possible, so Red Core can now be used in Mixins for example
- `RedLogger#printFramedError` will not add empty lines if `whatNow` and/or `additionalInformation` is empty

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

