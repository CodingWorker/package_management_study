<?php
$str = require './third/vendor/autoload.php';

$log = new Monolog\Logger('index');
$log->pushHandler(new Monolog\Handler\StreamHandler('../log/app.log', Monolog\Logger::WARNING));

$log->addWarning('Foo');

