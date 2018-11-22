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
            livereload: true,
            host: 'localhost',
            fallback: '_html/login.html',
            port: 3000,
            open: true,
            directoryListing: {
                enable: true,
                path: 'example'
            }
        }))
})
