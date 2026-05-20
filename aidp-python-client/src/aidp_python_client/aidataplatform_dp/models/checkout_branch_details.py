# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CheckoutBranchDetails(object):
    """
    Information required to checkout a new Git branch.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CheckoutBranchDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param branch_name:
            The value to assign to the branch_name property of this CheckoutBranchDetails.
        :type branch_name: str

        :param git_folder_path:
            The value to assign to the git_folder_path property of this CheckoutBranchDetails.
        :type git_folder_path: str

        """
        self.swagger_types = {
            'branch_name': 'str',
            'git_folder_path': 'str'
        }

        self.attribute_map = {
            'branch_name': 'branchName',
            'git_folder_path': 'gitFolderPath'
        }

        self._branch_name = None
        self._git_folder_path = None

    @property
    def branch_name(self):
        """
        **[Required]** Gets the branch_name of this CheckoutBranchDetails.
        The name of the Git branch.


        :return: The branch_name of this CheckoutBranchDetails.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this CheckoutBranchDetails.
        The name of the Git branch.


        :param branch_name: The branch_name of this CheckoutBranchDetails.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def git_folder_path(self):
        """
        **[Required]** Gets the git_folder_path of this CheckoutBranchDetails.
        The path of the Git folder in the context.


        :return: The git_folder_path of this CheckoutBranchDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this CheckoutBranchDetails.
        The path of the Git folder in the context.


        :param git_folder_path: The git_folder_path of this CheckoutBranchDetails.
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
