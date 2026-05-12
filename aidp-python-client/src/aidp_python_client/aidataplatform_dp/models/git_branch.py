# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitBranch(object):
    """
    Git Branch details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GitBranch object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param branch_name:
            The value to assign to the branch_name property of this GitBranch.
        :type branch_name: str

        :param git_url:
            The value to assign to the git_url property of this GitBranch.
        :type git_url: str

        :param error_message:
            The value to assign to the error_message property of this GitBranch.
        :type error_message: str

        :param std_out:
            The value to assign to the std_out property of this GitBranch.
        :type std_out: str

        :param std_err:
            The value to assign to the std_err property of this GitBranch.
        :type std_err: str

        :param git_exit_code:
            The value to assign to the git_exit_code property of this GitBranch.
        :type git_exit_code: int

        """
        self.swagger_types = {
            'branch_name': 'str',
            'git_url': 'str',
            'error_message': 'str',
            'std_out': 'str',
            'std_err': 'str',
            'git_exit_code': 'int'
        }

        self.attribute_map = {
            'branch_name': 'branchName',
            'git_url': 'gitUrl',
            'error_message': 'errorMessage',
            'std_out': 'stdOut',
            'std_err': 'stdErr',
            'git_exit_code': 'gitExitCode'
        }

        self._branch_name = None
        self._git_url = None
        self._error_message = None
        self._std_out = None
        self._std_err = None
        self._git_exit_code = None

    @property
    def branch_name(self):
        """
        **[Required]** Gets the branch_name of this GitBranch.
        The name of the git branch


        :return: The branch_name of this GitBranch.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this GitBranch.
        The name of the git branch


        :param branch_name: The branch_name of this GitBranch.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def git_url(self):
        """
        **[Required]** Gets the git_url of this GitBranch.
        The git repository url corresponding to the branch


        :return: The git_url of this GitBranch.
        :rtype: str
        """
        return self._git_url

    @git_url.setter
    def git_url(self, git_url):
        """
        Sets the git_url of this GitBranch.
        The git repository url corresponding to the branch


        :param git_url: The git_url of this GitBranch.
        :type: str
        """
        self._git_url = git_url

    @property
    def error_message(self):
        """
        Gets the error_message of this GitBranch.
        Git Error Message


        :return: The error_message of this GitBranch.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """
        Sets the error_message of this GitBranch.
        Git Error Message


        :param error_message: The error_message of this GitBranch.
        :type: str
        """
        self._error_message = error_message

    @property
    def std_out(self):
        """
        Gets the std_out of this GitBranch.
        Git STDOUT Message


        :return: The std_out of this GitBranch.
        :rtype: str
        """
        return self._std_out

    @std_out.setter
    def std_out(self, std_out):
        """
        Sets the std_out of this GitBranch.
        Git STDOUT Message


        :param std_out: The std_out of this GitBranch.
        :type: str
        """
        self._std_out = std_out

    @property
    def std_err(self):
        """
        Gets the std_err of this GitBranch.
        Git STDERR Message


        :return: The std_err of this GitBranch.
        :rtype: str
        """
        return self._std_err

    @std_err.setter
    def std_err(self, std_err):
        """
        Sets the std_err of this GitBranch.
        Git STDERR Message


        :param std_err: The std_err of this GitBranch.
        :type: str
        """
        self._std_err = std_err

    @property
    def git_exit_code(self):
        """
        Gets the git_exit_code of this GitBranch.
        Git exit status


        :return: The git_exit_code of this GitBranch.
        :rtype: int
        """
        return self._git_exit_code

    @git_exit_code.setter
    def git_exit_code(self, git_exit_code):
        """
        Sets the git_exit_code of this GitBranch.
        Git exit status


        :param git_exit_code: The git_exit_code of this GitBranch.
        :type: int
        """
        self._git_exit_code = git_exit_code

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
