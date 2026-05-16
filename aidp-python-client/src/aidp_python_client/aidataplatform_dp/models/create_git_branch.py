# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateGitBranch(object):
    """
    Git Branch details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateGitBranch object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_branch_name:
            The value to assign to the git_branch_name property of this CreateGitBranch.
        :type git_branch_name: str

        :param git_url:
            The value to assign to the git_url property of this CreateGitBranch.
        :type git_url: str

        :param error_message:
            The value to assign to the error_message property of this CreateGitBranch.
        :type error_message: str

        :param std_out:
            The value to assign to the std_out property of this CreateGitBranch.
        :type std_out: str

        :param std_err:
            The value to assign to the std_err property of this CreateGitBranch.
        :type std_err: str

        :param git_exit_code:
            The value to assign to the git_exit_code property of this CreateGitBranch.
        :type git_exit_code: int

        :param git_folder_path:
            The value to assign to the git_folder_path property of this CreateGitBranch.
        :type git_folder_path: str

        """
        self.swagger_types = {
            'git_branch_name': 'str',
            'git_url': 'str',
            'error_message': 'str',
            'std_out': 'str',
            'std_err': 'str',
            'git_exit_code': 'int',
            'git_folder_path': 'str'
        }

        self.attribute_map = {
            'git_branch_name': 'gitBranchName',
            'git_url': 'gitUrl',
            'error_message': 'errorMessage',
            'std_out': 'stdOut',
            'std_err': 'stdErr',
            'git_exit_code': 'gitExitCode',
            'git_folder_path': 'gitFolderPath'
        }

        self._git_branch_name = None
        self._git_url = None
        self._error_message = None
        self._std_out = None
        self._std_err = None
        self._git_exit_code = None
        self._git_folder_path = None

    @property
    def git_branch_name(self):
        """
        **[Required]** Gets the git_branch_name of this CreateGitBranch.
        The name of the git branch


        :return: The git_branch_name of this CreateGitBranch.
        :rtype: str
        """
        return self._git_branch_name

    @git_branch_name.setter
    def git_branch_name(self, git_branch_name):
        """
        Sets the git_branch_name of this CreateGitBranch.
        The name of the git branch


        :param git_branch_name: The git_branch_name of this CreateGitBranch.
        :type: str
        """
        self._git_branch_name = git_branch_name

    @property
    def git_url(self):
        """
        **[Required]** Gets the git_url of this CreateGitBranch.
        The git repository url corresponding to the branch


        :return: The git_url of this CreateGitBranch.
        :rtype: str
        """
        return self._git_url

    @git_url.setter
    def git_url(self, git_url):
        """
        Sets the git_url of this CreateGitBranch.
        The git repository url corresponding to the branch


        :param git_url: The git_url of this CreateGitBranch.
        :type: str
        """
        self._git_url = git_url

    @property
    def error_message(self):
        """
        Gets the error_message of this CreateGitBranch.
        Git Error Message


        :return: The error_message of this CreateGitBranch.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """
        Sets the error_message of this CreateGitBranch.
        Git Error Message


        :param error_message: The error_message of this CreateGitBranch.
        :type: str
        """
        self._error_message = error_message

    @property
    def std_out(self):
        """
        Gets the std_out of this CreateGitBranch.
        Git STDOUT Message


        :return: The std_out of this CreateGitBranch.
        :rtype: str
        """
        return self._std_out

    @std_out.setter
    def std_out(self, std_out):
        """
        Sets the std_out of this CreateGitBranch.
        Git STDOUT Message


        :param std_out: The std_out of this CreateGitBranch.
        :type: str
        """
        self._std_out = std_out

    @property
    def std_err(self):
        """
        Gets the std_err of this CreateGitBranch.
        Git STDERR Message


        :return: The std_err of this CreateGitBranch.
        :rtype: str
        """
        return self._std_err

    @std_err.setter
    def std_err(self, std_err):
        """
        Sets the std_err of this CreateGitBranch.
        Git STDERR Message


        :param std_err: The std_err of this CreateGitBranch.
        :type: str
        """
        self._std_err = std_err

    @property
    def git_exit_code(self):
        """
        Gets the git_exit_code of this CreateGitBranch.
        Git exit status


        :return: The git_exit_code of this CreateGitBranch.
        :rtype: int
        """
        return self._git_exit_code

    @git_exit_code.setter
    def git_exit_code(self, git_exit_code):
        """
        Sets the git_exit_code of this CreateGitBranch.
        Git exit status


        :param git_exit_code: The git_exit_code of this CreateGitBranch.
        :type: int
        """
        self._git_exit_code = git_exit_code

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this CreateGitBranch.
        The path of the current git folder which has to be created for the new branch


        :return: The git_folder_path of this CreateGitBranch.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this CreateGitBranch.
        The path of the current git folder which has to be created for the new branch


        :param git_folder_path: The git_folder_path of this CreateGitBranch.
        :type: str
        """
        self._git_folder_path = git_folder_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
