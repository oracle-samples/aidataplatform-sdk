# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateOntologyProjectDetails(object):
    """
    UpdateOntologyProjectDetails model.
    """

    #: A constant which can be used with the source_type property of a UpdateOntologyProjectDetails.
    #: This constant has a value of "VOLUME"
    SOURCE_TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the source_type property of a UpdateOntologyProjectDetails.
    #: This constant has a value of "GIT"
    SOURCE_TYPE_GIT = "GIT"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateOntologyProjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this UpdateOntologyProjectDetails.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this UpdateOntologyProjectDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this UpdateOntologyProjectDetails.
        :type description: str

        :param namespace:
            The value to assign to the namespace property of this UpdateOntologyProjectDetails.
        :type namespace: str

        :param workspace_base_path:
            The value to assign to the workspace_base_path property of this UpdateOntologyProjectDetails.
        :type workspace_base_path: str

        :param source_type:
            The value to assign to the source_type property of this UpdateOntologyProjectDetails.
            Allowed values for this property are: "VOLUME", "GIT"
        :type source_type: str

        :param git_repository_key:
            The value to assign to the git_repository_key property of this UpdateOntologyProjectDetails.
        :type git_repository_key: str

        :param git_branch_name:
            The value to assign to the git_branch_name property of this UpdateOntologyProjectDetails.
        :type git_branch_name: str

        :param git_folder_path:
            The value to assign to the git_folder_path property of this UpdateOntologyProjectDetails.
        :type git_folder_path: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this UpdateOntologyProjectDetails.
        :type lifecycle_state: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'namespace': 'str',
            'workspace_base_path': 'str',
            'source_type': 'str',
            'git_repository_key': 'str',
            'git_branch_name': 'str',
            'git_folder_path': 'str',
            'lifecycle_state': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'namespace': 'namespace',
            'workspace_base_path': 'workspaceBasePath',
            'source_type': 'sourceType',
            'git_repository_key': 'gitRepositoryKey',
            'git_branch_name': 'gitBranchName',
            'git_folder_path': 'gitFolderPath',
            'lifecycle_state': 'lifecycleState'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._namespace = None
        self._workspace_base_path = None
        self._source_type = None
        self._git_repository_key = None
        self._git_branch_name = None
        self._git_folder_path = None
        self._lifecycle_state = None

    @property
    def key(self):
        """
        Gets the key of this UpdateOntologyProjectDetails.

        :return: The key of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this UpdateOntologyProjectDetails.

        :param key: The key of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateOntologyProjectDetails.

        :return: The display_name of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateOntologyProjectDetails.

        :param display_name: The display_name of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this UpdateOntologyProjectDetails.

        :return: The description of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this UpdateOntologyProjectDetails.

        :param description: The description of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._description = description

    @property
    def namespace(self):
        """
        Gets the namespace of this UpdateOntologyProjectDetails.

        :return: The namespace of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this UpdateOntologyProjectDetails.

        :param namespace: The namespace of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._namespace = namespace

    @property
    def workspace_base_path(self):
        """
        Gets the workspace_base_path of this UpdateOntologyProjectDetails.
        Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.


        :return: The workspace_base_path of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._workspace_base_path

    @workspace_base_path.setter
    def workspace_base_path(self, workspace_base_path):
        """
        Sets the workspace_base_path of this UpdateOntologyProjectDetails.
        Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.


        :param workspace_base_path: The workspace_base_path of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._workspace_base_path = workspace_base_path

    @property
    def source_type(self):
        """
        Gets the source_type of this UpdateOntologyProjectDetails.
        Project content source.

        Allowed values for this property are: "VOLUME", "GIT"


        :return: The source_type of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """
        Sets the source_type of this UpdateOntologyProjectDetails.
        Project content source.


        :param source_type: The source_type of this UpdateOntologyProjectDetails.
        :type: str
        """
        allowed_values = ["VOLUME", "GIT"]
        if not value_allowed_none_or_none_sentinel(source_type, allowed_values):
            raise ValueError(
                "Invalid value for `source_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._source_type = source_type

    @property
    def git_repository_key(self):
        """
        Gets the git_repository_key of this UpdateOntologyProjectDetails.
        Git repository key for git-backed ontology projects.


        :return: The git_repository_key of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._git_repository_key

    @git_repository_key.setter
    def git_repository_key(self, git_repository_key):
        """
        Sets the git_repository_key of this UpdateOntologyProjectDetails.
        Git repository key for git-backed ontology projects.


        :param git_repository_key: The git_repository_key of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._git_repository_key = git_repository_key

    @property
    def git_branch_name(self):
        """
        Gets the git_branch_name of this UpdateOntologyProjectDetails.
        Git branch name for git-backed ontology projects.


        :return: The git_branch_name of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._git_branch_name

    @git_branch_name.setter
    def git_branch_name(self, git_branch_name):
        """
        Sets the git_branch_name of this UpdateOntologyProjectDetails.
        Git branch name for git-backed ontology projects.


        :param git_branch_name: The git_branch_name of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._git_branch_name = git_branch_name

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this UpdateOntologyProjectDetails.
        Workspace-relative Git folder path for git-backed ontology project content.


        :return: The git_folder_path of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this UpdateOntologyProjectDetails.
        Workspace-relative Git folder path for git-backed ontology project content.


        :param git_folder_path: The git_folder_path of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._git_folder_path = git_folder_path

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this UpdateOntologyProjectDetails.

        :return: The lifecycle_state of this UpdateOntologyProjectDetails.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this UpdateOntologyProjectDetails.

        :param lifecycle_state: The lifecycle_state of this UpdateOntologyProjectDetails.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
