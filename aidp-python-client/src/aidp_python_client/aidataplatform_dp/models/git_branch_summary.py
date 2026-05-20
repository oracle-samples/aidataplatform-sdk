# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class GitBranchSummary(object):
    """
    Git branch object summary.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new GitBranchSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param branch_name:
            The value to assign to the branch_name property of this GitBranchSummary.
        :type branch_name: str

        :param branch_path:
            The value to assign to the branch_path property of this GitBranchSummary.
        :type branch_path: str

        """
        self.swagger_types = {
            'branch_name': 'str',
            'branch_path': 'str'
        }

        self.attribute_map = {
            'branch_name': 'branchName',
            'branch_path': 'branchPath'
        }

        self._branch_name = None
        self._branch_path = None

    @property
    def branch_name(self):
        """
        **[Required]** Gets the branch_name of this GitBranchSummary.
        The name of the Git branch.


        :return: The branch_name of this GitBranchSummary.
        :rtype: str
        """
        return self._branch_name

    @branch_name.setter
    def branch_name(self, branch_name):
        """
        Sets the branch_name of this GitBranchSummary.
        The name of the Git branch.


        :param branch_name: The branch_name of this GitBranchSummary.
        :type: str
        """
        self._branch_name = branch_name

    @property
    def branch_path(self):
        """
        **[Required]** Gets the branch_path of this GitBranchSummary.
        Fully qualified branch path.


        :return: The branch_path of this GitBranchSummary.
        :rtype: str
        """
        return self._branch_path

    @branch_path.setter
    def branch_path(self, branch_path):
        """
        Sets the branch_path of this GitBranchSummary.
        Fully qualified branch path.


        :param branch_path: The branch_path of this GitBranchSummary.
        :type: str
        """
        self._branch_path = branch_path

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
