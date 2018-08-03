# Auth0 JavaEE Security Sample

## Getting started

This sample demonstrates how to use Auth0 with [JavaEE 8 Security API](https://javaee.github.io/security-spec/spec/jsr375-spec.html) to perform authentication using the `mvc-auth-commons` library. Download or clone this repository and follow the instructions below to setup the sample.

### Auth0 Dashboard
1. On the [Auth0 Dashboard](https://manage.auth0.com/#/clients) create a new Client of type `Regular Web Application`. 
1. Add the URL that will be called on an OAuth successful login to the Allowed Callback URLs. i.e.: `https://mysite.com/callback`.
1. Add the URL that will be called on logout to the Allowed Logout URLs. i.e.: `https://mysite.com/logout`.
1. Copy the `Domain`, `Client ID` and `Client Secret` values at the top of the page and use them to configure the Java Application.

### Java Application
Set the client values in the `src/main/resources/project-defaults.yml` file.

### Running the sample

Open a terminal, go to the project root directory and run the following command:

```bash
./mvnw thorntail:run
```

The server will be accessible on http://localhost:3000/. After logging in you should see the `userId` in the header.

## Running the sample as standalone jar

```bash
./mvnw clean package
java -jar target/auth0-javaee-security-thorntail.jar
```

## Issue Reporting

If you have found a bug or if you have a feature request, please report them at this repository issues section. Please do not report security vulnerabilities on the public GitHub issue tracker. The [Responsible Disclosure Program](https://auth0.com/whitehat) details the procedure for disclosing security issues.

## What is Auth0?

Auth0 helps you to:

* Add authentication with [multiple authentication sources](https://docs.auth0.com/identityproviders), either social like **Google, Facebook, Microsoft Account, LinkedIn, GitHub, Twitter, Box, Salesforce, amont others**, or enterprise identity systems like **Windows Azure AD, Google Apps, Active Directory, ADFS or any SAML Identity Provider**.
* Add authentication through more traditional **[username/password databases](https://docs.auth0.com/mysql-connection-tutorial)**.
* Add support for **[linking different user accounts](https://docs.auth0.com/link-accounts)** with the same user.
* Support for generating signed [Json Web Tokens](https://docs.auth0.com/jwt) to call your APIs and **flow the user identity** securely.
* Analytics of how, when and where users are logging in.
* Pull data from other sources and add it to the user profile, through [JavaScript rules](https://docs.auth0.com/rules).

## Create a free account in Auth0

1. Go to [Auth0](https://auth0.com) and click Sign Up.
2. Use Google, GitHub or Microsoft Account to login.

## Issue Reporting

If you have found a bug or if you have a feature request, please report them at this repository issues section. Please do not report security vulnerabilities on the public GitHub issue tracker. The [Responsible Disclosure Program](https://auth0.com/whitehat) details the procedure for disclosing security issues.

## Author

[Auth0](https://auth0.com)

## License

This project is licensed under the MIT license. See the [LICENSE](LICENSE.txt) file for more info.
