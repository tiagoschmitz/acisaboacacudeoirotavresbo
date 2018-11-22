const gulp = require('gulp')
const babel = require('gulp-babel')
const uglify = require('gulp-uglify')
const uglifycss = require('gulp-uglifycss')
const concat = require('gulp-concat')
const htmlmin = require('gulp-htmlmin')

gulp.task('app', ['app.html', 'app.css', 'app.js', "fonts", "img"])

gulp.task('app.html', () => {
    return gulp.src('app/**/*.html')
        .pipe(htmlmin({collapseWhitespace: true}))
        .pipe(gulp.dest('public/'))
})

gulp.task('app.css', () => {
    return gulp.src('app/**/*.css')
        .pipe(uglifycss({"uglyComments": true}))
        .pipe(concat('app.min.css'))
        .pipe(gulp.dest('public/_css'))
})

gulp.task('app.js', () => {
    return gulp.src('app/**/*.js')
        .pipe(babel({presets: ['env']}))
        .pipe(uglify())
        .pipe(concat('app.min.js'))
        .pipe(gulp.dest('public/_js'))
})

gulp.task('fonts', () => {
    return gulp.src('app/fonts/*')
        .pipe(gulp.dest('public/fonts'))
})
gulp.task('img', () => {
    return gulp.src('app/img/*')
        .pipe(gulp.dest('public/img'))
})
