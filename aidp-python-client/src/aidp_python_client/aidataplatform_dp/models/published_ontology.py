# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PublishedOntology(object):
    """
    Published ontology identity and runtime binding metadata.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PublishedOntology object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param project_id:
            The value to assign to the project_id property of this PublishedOntology.
        :type project_id: str

        :param workspace_id:
            The value to assign to the workspace_id property of this PublishedOntology.
        :type workspace_id: str

        :param project_key:
            The value to assign to the project_key property of this PublishedOntology.
        :type project_key: str

        :param display_name:
            The value to assign to the display_name property of this PublishedOntology.
        :type display_name: str

        :param namespace:
            The value to assign to the namespace property of this PublishedOntology.
        :type namespace: str

        :param published_ontology_name:
            The value to assign to the published_ontology_name property of this PublishedOntology.
        :type published_ontology_name: str

        :param deployment_target:
            The value to assign to the deployment_target property of this PublishedOntology.
        :type deployment_target: str

        :param deployment_connection:
            The value to assign to the deployment_connection property of this PublishedOntology.
        :type deployment_connection: str

        :param is_deployment_shared:
            The value to assign to the is_deployment_shared property of this PublishedOntology.
        :type is_deployment_shared: bool

        :param data_connection_refs:
            The value to assign to the data_connection_refs property of this PublishedOntology.
        :type data_connection_refs: list[str]

        :param status:
            The value to assign to the status property of this PublishedOntology.
        :type status: str

        :param time_published:
            The value to assign to the time_published property of this PublishedOntology.
        :type time_published: datetime

        :param published_by:
            The value to assign to the published_by property of this PublishedOntology.
        :type published_by: str

        """
        self.swagger_types = {
            'project_id': 'str',
            'workspace_id': 'str',
            'project_key': 'str',
            'display_name': 'str',
            'namespace': 'str',
            'published_ontology_name': 'str',
            'deployment_target': 'str',
            'deployment_connection': 'str',
            'is_deployment_shared': 'bool',
            'data_connection_refs': 'list[str]',
            'status': 'str',
            'time_published': 'datetime',
            'published_by': 'str'
        }

        self.attribute_map = {
            'project_id': 'projectId',
            'workspace_id': 'workspaceId',
            'project_key': 'projectKey',
            'display_name': 'displayName',
            'namespace': 'namespace',
            'published_ontology_name': 'publishedOntologyName',
            'deployment_target': 'deploymentTarget',
            'deployment_connection': 'deploymentConnection',
            'is_deployment_shared': 'isDeploymentShared',
            'data_connection_refs': 'dataConnectionRefs',
            'status': 'status',
            'time_published': 'timePublished',
            'published_by': 'publishedBy'
        }

        self._project_id = None
        self._workspace_id = None
        self._project_key = None
        self._display_name = None
        self._namespace = None
        self._published_ontology_name = None
        self._deployment_target = None
        self._deployment_connection = None
        self._is_deployment_shared = None
        self._data_connection_refs = None
        self._status = None
        self._time_published = None
        self._published_by = None

    @property
    def project_id(self):
        """
        **[Required]** Gets the project_id of this PublishedOntology.
        Unique identifier of the source Ontology Manager project.


        :return: The project_id of this PublishedOntology.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """
        Sets the project_id of this PublishedOntology.
        Unique identifier of the source Ontology Manager project.


        :param project_id: The project_id of this PublishedOntology.
        :type: str
        """
        self._project_id = project_id

    @property
    def workspace_id(self):
        """
        **[Required]** Gets the workspace_id of this PublishedOntology.
        Unique identifier of the workspace that owns the source project.


        :return: The workspace_id of this PublishedOntology.
        :rtype: str
        """
        return self._workspace_id

    @workspace_id.setter
    def workspace_id(self, workspace_id):
        """
        Sets the workspace_id of this PublishedOntology.
        Unique identifier of the workspace that owns the source project.


        :param workspace_id: The workspace_id of this PublishedOntology.
        :type: str
        """
        self._workspace_id = workspace_id

    @property
    def project_key(self):
        """
        **[Required]** Gets the project_key of this PublishedOntology.
        Workspace-scoped project key of the source Ontology Manager project.


        :return: The project_key of this PublishedOntology.
        :rtype: str
        """
        return self._project_key

    @project_key.setter
    def project_key(self, project_key):
        """
        Sets the project_key of this PublishedOntology.
        Workspace-scoped project key of the source Ontology Manager project.


        :param project_key: The project_key of this PublishedOntology.
        :type: str
        """
        self._project_key = project_key

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this PublishedOntology.
        Display name of the published ontology project.


        :return: The display_name of this PublishedOntology.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this PublishedOntology.
        Display name of the published ontology project.


        :param display_name: The display_name of this PublishedOntology.
        :type: str
        """
        self._display_name = display_name

    @property
    def namespace(self):
        """
        Gets the namespace of this PublishedOntology.
        Ontology namespace associated with the published project.


        :return: The namespace of this PublishedOntology.
        :rtype: str
        """
        return self._namespace

    @namespace.setter
    def namespace(self, namespace):
        """
        Sets the namespace of this PublishedOntology.
        Ontology namespace associated with the published project.


        :param namespace: The namespace of this PublishedOntology.
        :type: str
        """
        self._namespace = namespace

    @property
    def published_ontology_name(self):
        """
        Gets the published_ontology_name of this PublishedOntology.
        Ontology identity requested at publish time; omitted for legacy project-key publishes.


        :return: The published_ontology_name of this PublishedOntology.
        :rtype: str
        """
        return self._published_ontology_name

    @published_ontology_name.setter
    def published_ontology_name(self, published_ontology_name):
        """
        Sets the published_ontology_name of this PublishedOntology.
        Ontology identity requested at publish time; omitted for legacy project-key publishes.


        :param published_ontology_name: The published_ontology_name of this PublishedOntology.
        :type: str
        """
        self._published_ontology_name = published_ontology_name

    @property
    def deployment_target(self):
        """
        Gets the deployment_target of this PublishedOntology.
        Runtime publish target used by the deployed ontology.


        :return: The deployment_target of this PublishedOntology.
        :rtype: str
        """
        return self._deployment_target

    @deployment_target.setter
    def deployment_target(self, deployment_target):
        """
        Sets the deployment_target of this PublishedOntology.
        Runtime publish target used by the deployed ontology.


        :param deployment_target: The deployment_target of this PublishedOntology.
        :type: str
        """
        self._deployment_target = deployment_target

    @property
    def deployment_connection(self):
        """
        Gets the deployment_connection of this PublishedOntology.
        Runtime target connection used by the deployed ontology, when one was requested.


        :return: The deployment_connection of this PublishedOntology.
        :rtype: str
        """
        return self._deployment_connection

    @deployment_connection.setter
    def deployment_connection(self, deployment_connection):
        """
        Sets the deployment_connection of this PublishedOntology.
        Runtime target connection used by the deployed ontology, when one was requested.


        :param deployment_connection: The deployment_connection of this PublishedOntology.
        :type: str
        """
        self._deployment_connection = deployment_connection

    @property
    def is_deployment_shared(self):
        """
        Gets the is_deployment_shared of this PublishedOntology.
        Whether the runtime deployment target is shared.


        :return: The is_deployment_shared of this PublishedOntology.
        :rtype: bool
        """
        return self._is_deployment_shared

    @is_deployment_shared.setter
    def is_deployment_shared(self, is_deployment_shared):
        """
        Sets the is_deployment_shared of this PublishedOntology.
        Whether the runtime deployment target is shared.


        :param is_deployment_shared: The is_deployment_shared of this PublishedOntology.
        :type: bool
        """
        self._is_deployment_shared = is_deployment_shared

    @property
    def data_connection_refs(self):
        """
        Gets the data_connection_refs of this PublishedOntology.
        Logical data source connection references declared by the project RML mappings. These are refs, not credential payloads.


        :return: The data_connection_refs of this PublishedOntology.
        :rtype: list[str]
        """
        return self._data_connection_refs

    @data_connection_refs.setter
    def data_connection_refs(self, data_connection_refs):
        """
        Sets the data_connection_refs of this PublishedOntology.
        Logical data source connection references declared by the project RML mappings. These are refs, not credential payloads.


        :param data_connection_refs: The data_connection_refs of this PublishedOntology.
        :type: list[str]
        """
        self._data_connection_refs = data_connection_refs

    @property
    def status(self):
        """
        **[Required]** Gets the status of this PublishedOntology.
        Latest effective publish lifecycle state for the ontology project.


        :return: The status of this PublishedOntology.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this PublishedOntology.
        Latest effective publish lifecycle state for the ontology project.


        :param status: The status of this PublishedOntology.
        :type: str
        """
        self._status = status

    @property
    def time_published(self):
        """
        Gets the time_published of this PublishedOntology.
        Time when the ontology project was most recently published.


        :return: The time_published of this PublishedOntology.
        :rtype: datetime
        """
        return self._time_published

    @time_published.setter
    def time_published(self, time_published):
        """
        Sets the time_published of this PublishedOntology.
        Time when the ontology project was most recently published.


        :param time_published: The time_published of this PublishedOntology.
        :type: datetime
        """
        self._time_published = time_published

    @property
    def published_by(self):
        """
        Gets the published_by of this PublishedOntology.
        Principal that most recently published the ontology project.


        :return: The published_by of this PublishedOntology.
        :rtype: str
        """
        return self._published_by

    @published_by.setter
    def published_by(self, published_by):
        """
        Sets the published_by of this PublishedOntology.
        Principal that most recently published the ontology project.


        :param published_by: The published_by of this PublishedOntology.
        :type: str
        """
        self._published_by = published_by

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
