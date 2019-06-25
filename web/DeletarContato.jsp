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
        <title>DiaryBOOK - Deletar Conta</title>
        <link rel="icon" href="agendaIcon.png">
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link href="css/cadUser.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div id="header">
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
                                <h2>Deletar Contato</h2>
                                <p>Esperamos que você cadastre um novo! BYE</p>
                            </div>
                        </div>

                        <div class="col-md-7 col-sm-10">

                            <br>
                            <br>
                            <div class="wow fadeInUp" data-wow-delay="0.4s">
                                <form name="formDeletarUsuario" action="DeletarContato" >
                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                        <input type="text" class="form-control" name="id" placeholder="Informe o ID do Contato" required="" id="formControl">
                                    </div>
                                    <div class="col-md-offset-8 col-md-4 col-sm-offset-6 col-sm-6">
                                        <button  type="submit" class="form-control" name="submit" id="btCad">Deletar</button>
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
