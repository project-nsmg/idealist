<div class="bs-callout bs-callout-danger">
 <h3>MongoDB Configuration is Required</h3>
 <p>Before continuing please follow the steps below to configure your MongoDB connection.</p>
 <ol>
   <li> Ensure that MongoDB is up and running.
   <li> Add the connection parameters in the <code>idealist.db.core</code> namespace.
   <li> Restart the application.
 </ol>
</div>

### Managing Your Middleware

Request middleware functions are located under the `idealist.middleware` namespace.
A request logging helper called `log-request` has already been defined for you there.

This namespace also defines two vectors for organizing the middleware called `development-middleware` and `production-middleware`.
Any middleware that you only wish to run in development mode, such as `log-request`, should be added to the first vector.

### Here are some links to get started

1. [HTML templating](http://www.luminusweb.net/docs/html_templating.md)
2. [Accessing the database](http://www.luminusweb.net/docs/database.md)
3. [Serving static resources](http://www.luminusweb.net/docs/static_resources.md)
4. [Setting response types](http://www.luminusweb.net/docs/responses.md)
5. [Defining routes](http://www.luminusweb.net/docs/routes.md)
6. [Adding middleware](http://www.luminusweb.net/docs/middleware.md)
7. [Sessions and cookies](http://www.luminusweb.net/docs/sessions_cookies.md)
8. [Security](http://www.luminusweb.net/docs/security.md)
9. [Deploying the application](http://www.luminusweb.net/docs/deployment.md)