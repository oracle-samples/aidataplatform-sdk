# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateOntologyProjectDetails(object):
    """
    CreateOntologyProjectDetails model.
    """

    #: A constant which can be used with the source_type property of a CreateOntologyProjectDetails.
    #: This constant has a value of "VOLUME"
    SOURCE_TYPE_VOLUME = "VOLUME"

    #: A constant which can be used with the source_type property of a CreateOntologyProjectDetails.
    #: This constant has a value of "GIT"
    SOURCE_TYPE_GIT = "GIT"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateOntologyProjectDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param workspace_id:
            The value to assign to the workspace_id property of this CreateOntologyProjectDetails.
        :type workspace_id: str

        :param key:
            The value to assign to the key property of this CreateOntologyProjectDetails.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this CreateOntologyProjectDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateOntologyProjectDetails.
        :type description: str

        :param namespace:
            The value to assign to the namespace property of this CreateOntologyProjectDetails.
        :type namespace: str

        :param creator:
            The value to assign to the creator property of this CreateOntologyProjectDetails.
        :type creator: str

        :param ontology_version:
            The value to assign to the ontology_version property of this CreateOntologyProjectDetails.
        :type ontology_version: str

        :param base_uri:
            The value to assign to the base_uri property of this CreateOntologyProjectDetails.
        :type base_uri: str

        :param default_language:
            The value to assign to the default_language property of this CreateOntologyProjectDetails.
        :type default_language: str

        :param workspace_base_path:
            The value to assign to the workspace_base_path property of this CreateOntologyProjectDetails.
        :type workspace_base_path: str

        :param source_type:
            The value to assign to the source_type property of this CreateOntologyProjectDetails.
            Allowed values for this property are: "VOLUME", "GIT"
        :type source_type: str

        :param git_repository_key:
            The value to assign to the git_repository_key property of this CreateOntologyProjectDetails.
        :type git_repository_key: str

        :param git_branch_name:
            The value to assign to the git_branch_name property of this CreateOntologyProjectDetails.
        :type git_branch_name: str

        :param git_folder_path:
            The value to assign to the git_folder_path property of this CreateOntologyProjectDetails.
        :type git_folder_path: str

        """
        self.swagger_types = {
            'workspace_id': 'str',
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'namespace': 'str',
            'creator': 'str',
            'ontology_version': 'str',
            'base_uri': 'str',
            'default_language': 'str',
            'workspace_base_path': 'str',
            'source_type': 'str',
            'git_repository_key': 'str',
            'git_branch_name': 'str',
            'git_folder_path': 'str'
        }

        self.attribute_map = {
            'workspace_id': 'workspaceId',
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'namespace': 'namespace',
            'creator': 'creator',
            'ontology_version': 'ontologyVersion',
            'base_uri': 'baseUri',
            'default_language': 'defaultLanguage',
            'workspace_base_path': 'workspaceBasePath',
            'source_type': 'sourceType',
            'git_repository_key': 'gitRepositoryKey',
            'git_branch_name': 'gitBranchName',
            'git_folder_path': 'gitFolderPath'
        }

        self._workspace_id = None
        self._key = None
        self._display_name = None
        self._description = None
        self._namespace = None
        self._creator = None
        self._ontology_version = None
        self._base_uri = None
        self._default_language = None
        self._workspace_base_path = None
        self._source_type = None
        self._git_repository_key = None
        self._git_branch_name = None
        self._git_folder_path = None

    @property
    def workspace_id(self):
        """
        Gets the workspace_id of this CreateOntologyProjectDetails.

        :return: The workspace_id of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._workspace_id

    @workspace_id.setter
    def workspace_id(self, workspace_id):
        """
        Sets the workspace_id of this CreateOntologyProjectDetails.

        :param workspace_id: The workspace_id of this CreateOntologyProjectDetails.
        :type: str
        """
        self._workspace_id = workspace_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this CreateOntologyProjectDetails.

        :return: The key of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this CreateOntologyProjectDetails.

        :param key: The key of this CreateOntologyProjectDetails.
        :type: str
        """
        self._key = key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateOntologyProjectDetails.

        :return: The display_name of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateOntologyProjectDetails.

        :param display_name: The display_name of this CreateOntologyProjectDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateOntologyProjectDetails.

        :return: The description of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateOntologyProjectDetails.

        :param description: The description of this CreateOntologyProjectDetails.
        :type: str
        """
        self._description = description

    @property
    def namespace(self):
        """
        Gets the namespace of this CreateOntologyProjectDetails.

        :return: The namespace of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this CreateOntologyProjectDetails.

        :param namespace: The namespace of this CreateOntologyProjectDetails.
        :type: str
        """
        self._namespace = namespace

    @property
    def creator(self):
        """
        Gets the creator of this CreateOntologyProjectDetails.
        Creator name written into the generated project.yaml metadata file.


        :return: The creator of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._creator

    @creator.setter
    def creator(self, creator):
        """
        Sets the creator of this CreateOntologyProjectDetails.
        Creator name written into the generated project.yaml metadata file.


        :param creator: The creator of this CreateOntologyProjectDetails.
        :type: str
        """
        self._creator = creator

    @property
    def ontology_version(self):
        """
        Gets the ontology_version of this CreateOntologyProjectDetails.
        Initial semantic ontology version written into project.yaml.


        :return: The ontology_version of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._ontology_version

    @ontology_version.setter
    def ontology_version(self, ontology_version):
        """
        Sets the ontology_version of this CreateOntologyProjectDetails.
        Initial semantic ontology version written into project.yaml.


        :param ontology_version: The ontology_version of this CreateOntologyProjectDetails.
        :type: str
        """
        self._ontology_version = ontology_version

    @property
    def base_uri(self):
        """
        Gets the base_uri of this CreateOntologyProjectDetails.
        Base URI written as baseURI in project.yaml.


        :return: The base_uri of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._base_uri

    @base_uri.setter
    def base_uri(self, base_uri):
        """
        Sets the base_uri of this CreateOntologyProjectDetails.
        Base URI written as baseURI in project.yaml.


        :param base_uri: The base_uri of this CreateOntologyProjectDetails.
        :type: str
        """
        self._base_uri = base_uri

    @property
    def default_language(self):
        """
        Gets the default_language of this CreateOntologyProjectDetails.
        Default language tag written into project.yaml.


        :return: The default_language of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._default_language

    @default_language.setter
    def default_language(self, default_language):
        """
        Sets the default_language of this CreateOntologyProjectDetails.
        Default language tag written into project.yaml.


        :param default_language: The default_language of this CreateOntologyProjectDetails.
        :type: str
        """
        self._default_language = default_language

    @property
    def workspace_base_path(self):
        """
        Gets the workspace_base_path of this CreateOntologyProjectDetails.
        Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.


        :return: The workspace_base_path of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._workspace_base_path

    @workspace_base_path.setter
    def workspace_base_path(self, workspace_base_path):
        """
        Sets the workspace_base_path of this CreateOntologyProjectDetails.
        Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.


        :param workspace_base_path: The workspace_base_path of this CreateOntologyProjectDetails.
        :type: str
        """
        self._workspace_base_path = workspace_base_path

    @property
    def source_type(self):
        """
        Gets the source_type of this CreateOntologyProjectDetails.
        Project content source. Defaults to VOLUME when omitted.

        Allowed values for this property are: "VOLUME", "GIT"


        :return: The source_type of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """
        Sets the source_type of this CreateOntologyProjectDetails.
        Project content source. Defaults to VOLUME when omitted.


        :param source_type: The source_type of this CreateOntologyProjectDetails.
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
        Gets the git_repository_key of this CreateOntologyProjectDetails.
        Git repository key for git-backed ontology projects.


        :return: The git_repository_key of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._git_repository_key

    @git_repository_key.setter
    def git_repository_key(self, git_repository_key):
        """
        Sets the git_repository_key of this CreateOntologyProjectDetails.
        Git repository key for git-backed ontology projects.


        :param git_repository_key: The git_repository_key of this CreateOntologyProjectDetails.
        :type: str
        """
        self._git_repository_key = git_repository_key

    @property
    def git_branch_name(self):
        """
        Gets the git_branch_name of this CreateOntologyProjectDetails.
        Git branch name for git-backed ontology projects.


        :return: The git_branch_name of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._git_branch_name

    @git_branch_name.setter
    def git_branch_name(self, git_branch_name):
        """
        Sets the git_branch_name of this CreateOntologyProjectDetails.
        Git branch name for git-backed ontology projects.


        :param git_branch_name: The git_branch_name of this CreateOntologyProjectDetails.
        :type: str
        """
        self._git_branch_name = git_branch_name

    @property
    def git_folder_path(self):
        """
        Gets the git_folder_path of this CreateOntologyProjectDetails.
        Workspace-relative Git folder path for git-backed ontology project content.


        :return: The git_folder_path of this CreateOntologyProjectDetails.
        :rtype: str
        """
        return self._git_folder_path

    @git_folder_path.setter
    def git_folder_path(self, git_folder_path):
        """
        Sets the git_folder_path of this CreateOntologyProjectDetails.
        Workspace-relative Git folder path for git-backed ontology project content.


        :param git_folder_path: The git_folder_path of this CreateOntologyProjectDetails.
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
