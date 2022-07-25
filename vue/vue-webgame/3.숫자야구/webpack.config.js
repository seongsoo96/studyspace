const VueLoaderPlugin = require('vue-loader/lib/plugin');
const path = require('path');

//노드에 모듈을 만들었다.
module.exports = {
    mode: 'development',
    devtool: 'eval',
    resolve: {
      extensions: ['.js', '.vue']
    },
    entry: {
        app: path.join(__dirname, 'main.js'),
    },
    module: {
        rules: [{
            test: /\.vue$/,
            use: 'vue-loader',
        }],
    },
    plugins: [
        new VueLoaderPlugin(),
    ],
    output: {
        filename: '[name].js',
        path: path.join(__dirname, 'dist'),
    },
};