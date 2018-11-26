const gulp = require('gulp')
const watch = require('gulp-watch')
const webserver = require('gulp-webserver')

gulp.task('watch', () => {
    watch('app/**/*.html', () => gulp.start('app.html'))
    watch('app/**/*.css', () => gulp.start('app.css'))
    watch('app/**/*js', () => gulp.start('app.js'))
    watch('app/fonts/*', () => gulp.start('fonts'))
    watch('app/img/*', () => gulp.start('img'))
})

gulp.task('server', ['watch'], () => {
    return gulp.src('public')
        .pipe(webserver({
            // livereload: true,
            host: 'localhost',
            fallback: '_html/index.html',
            port: 3000,
            open: 'http://localhost:3000/_html/index.html',
            // path: "public/_html/index.html",
            // proxies: [
            //     {
            //         source: '/login', target: 'http://localhost:3000/cadastro.html',options:{
            //             headers:{'abc':'cadastro'}
            //         }
            //     }
            // ],
            // directoryListing: {
            //     enable: true,
            //     // path: '_html/*.html'
            // }
        }))
})
