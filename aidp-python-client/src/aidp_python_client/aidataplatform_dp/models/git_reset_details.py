# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitResetDetails(object):
    """
    Details needed to reset the current branch for a folder context.
    """

    #: A constant which can be used with the reset_mode property of a GitResetDetails.
    #: This constant has a value of "SOFT"
    RESET_MODE_SOFT = "SOFT"

    #: A constant which can be used with the reset_mode property of a GitResetDetails.
    #: This constant has a value of "MIXED"
    RESET_MODE_MIXED = "MIXED"

    #: A constant which can be used with the reset_mode property of a GitResetDetails.
    #: This constant has a value of "HARD"
    RESET_MODE_HARD = "HARD"

    def __init__(self, **kwargs):
        """
        Initializes a new GitResetDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param git_folder_path:
            The value to assign to the git_folder_path property of this GitResetDetails.
        :type git_folder_path: str

        :param branch_name:
            The value to assign to the branch_name property of this GitResetDetails.
        :type branch_name: str

        :param commit_id:
            The value to assign to the commit_id property of this GitResetDetails.
        :type commit_id: str

        :param reset_mode:
            The value to assign to the reset_mode property of this GitResetDetails.
            Allowed values for this property are: "SOFT", "MIXED", "HARD"
        :type reset_mode: str

        """
        self.swagger_types = {
            'git_folder_path': 'str',
            'branch_name': 'str',
            'commit_id': 'str',
            'reset_mode': 'str'
        }

        self.attribute_map = {
            'git_folder_path': 'gitFolderPath',
            'branch_name': 'branchName',
            'commit_id': 'commitId',
            'reset_mode': 'resetMode'
        }

        self._git_folder_path = None
        self._branch_name = None
        self._commit_id = None
        self._reset_mode = None

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this GitResetDetails.
        Folder path used to locate the Git worktree.


        :return: The git_folder_path of this GitResetDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this GitResetDetails.
        Folder path used to locate the Git worktree.


        :param git_folder_path: The git_folder_path of this GitResetDetails.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def branch_name(self):
        """
        Gets the branch_name of this GitResetDetails.
        The name of the Git branch.


        :return: The branch_name of this GitResetDetails.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this GitResetDetails.
        The name of the Git branch.


        :param branch_name: The branch_name of this GitResetDetails.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def commit_id(self):
        """
        Gets the commit_id of this GitResetDetails.
        Commit ID/ref to reset to. If omitted, server may default to HEAD~1 for soft reset flows.


        :return: The commit_id of this GitResetDetails.
        :rtype: str
        """
        return self._commit_id

    @commit_id.setter
    def commit_id(self, commit_id):
        """
        Sets the commit_id of this GitResetDetails.
        Commit ID/ref to reset to. If omitted, server may default to HEAD~1 for soft reset flows.


        :param commit_id: The commit_id of this GitResetDetails.
        :type: str
        """
        self._commit_id = commit_id

    @property
    def reset_mode(self):
        """
        Gets the reset_mode of this GitResetDetails.
        Reset mode requested.

        Allowed values for this property are: "SOFT", "MIXED", "HARD"


        :return: The reset_mode of this GitResetDetails.
        :rtype: str
        """
        return self._reset_mode

    @reset_mode.setter
    def reset_mode(self, reset_mode):
        """
        Sets the reset_mode of this GitResetDetails.
        Reset mode requested.


        :param reset_mode: The reset_mode of this GitResetDetails.
        :type: str
        """
        allowed_values = ["SOFT", "MIXED", "HARD"]
        if not value_allowed_none_or_none_sentinel(reset_mode, allowed_values):
            raise ValueError(
                "Invalid value for `reset_mode`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._reset_mode = reset_mode

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
