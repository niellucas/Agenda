<%-- 
    Document   : cadastraUsuario
    Created on : 23/06/2019, 21:55:18
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DiaryBOOK - Cadastro de Contatos</title>
        <link rel="icon" href="agendaIcon.png">
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link href="css/cadUser.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="header" >
            <div id="inner_header">
                <div id="logo_container">
                    <a href="menuPrincipal.jsp">
                        <h1>Diary<span>BOOK</span></h1>
                    </a>
                </div>

                <ul id="navegar">
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li></li></a>
                    <a><li>A sua agenda digital</li></a>
                </ul>
            </div>
        </div>




        <section id="contact" id="parallax-section">
            <div class="form-container" id="form-container">
                <center> 
                    <div class="row">

                        <div class="col-md-12 col-sm-12">

                            <br>

                            <div class="wow fadeInUp section-title" data-wow-delay="0.2s">
                                <h2>Cadastrar Contato</h2>
                                <p>Para que tudo ocorra bem, preencha todos os campos abaixo.</p>
                            </div>
                        </div>

                        <div class="col-md-7 col-sm-10">

                            <br>
                            <br>

                            <div class="wow fadeInUp" data-wow-delay="0.4s">
                                <form id="formCadastraEndereco" method="post" action="CadastrarEndereco" >
                                    <div class="col-md-8 col-sm-8 col-xs-8 ">
                                        <input type="text" class="form-control" name="endereco" placeholder="Endereco" required="" id="formControl">
                                    </div>
                                    <div class="col-md-4 col-sm-4">
                                        <input type="text" class="form-control" name="numero" placeholder="Numero" required="" id="formControl">
                                    </div>
                                    <div class="col-md-12 col-sm-12">
                                        <input type="text" class="form-control" name="complemento" placeholder="Complemento" required="" id="formControl">
                                    </div>
                                    <div class="col-md-12 col-sm-12">
                                        <input type="text" class="form-control" name="bairro" placeholder="Bairro" required="" id="formControl">
                                    </div>
                                    <div class="col-md-9 col-sm-9">
                                        <input type="text" class="form-control" name="cidade" placeholder="Cidade" required="" id="formControl">
                                    </div>
                                    <div class="col-md-3 col-sm-3">
                                        <input type="text" class="form-control" name="uf" placeholder="UF" required="" id="formControl">
                                    </div>
                                    <div class="col-md-12 col-sm-12">
                                        <input type="text" class="form-control" name="tipoEndereco" placeholder="Tipo de Endereco" required="" id="formControl">
                                    </div>
                                    <div class="col-md-offset-8 col-md-4 col-sm-offset-6 col-sm-6">
                                        <button  type="submit" class="form-control" name="submit" id="btCad">Cadastrar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </center>
            </div>
        </section>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <p>
        <footer>
            <div class="container" >
                <div class="row">
                    <div class="wow fadeInUp col-md-12 col-sm-12" data-wow-delay="0.8s">
                        <p class="white-color">Copyright &copy; 2019 DiaryBOOK 
                            | BY: Lucas Daniel</p>
                        <div class="wow fadeInUp" data-wow-delay="1s">
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>
