# FunWithMatchers
A demo Java project to illustrate the usage of matchers.

This project illustrates the following use cases:

1. No matchers: Using only `assertEquals()`.
1. Rolling your own custom **Hamcrest** `TypeSafeMatcher`.
1. Using **Shazamcrest**.
1. Matching the **arguments** of mock interactions with Mockito.

Look at the labels in the commit history for each of the above.

## Talk outline
* Motivation for using matchers
    1. Reduce `assertEquals()`
    1. More readable tests
    1. *Why you should not use `equals()`:* Identity vs State; Consistency with `hashCode()`
* When to write your own Matcher
    1. Check the state of all or some fields
    1. Comparing non-congruent objects
    1. Complex matching rules
* Shortcut: JSON comparison with Shazamcrest
    1. Reduces the pain of matching all the nested objects in the object graph
    1. `.ignore()`
* Matching arguments passed to mocks with Mockito.
    1. Mockito built-in matchers
    1. Hamcrest matchers using `argThat()`
* Something more challenging
    1. Matching collections of objects with a collection of matchers.
* *FUTURE: Alternative to argument matchers - captors*
    1. *Normal use*
    1. *When to use - see mockito docs*